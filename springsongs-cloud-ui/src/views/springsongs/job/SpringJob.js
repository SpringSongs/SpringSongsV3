import {
  search,
  save,
  edit,
  batchDelete,
  listAllSpringJobGroupCategory,
  pause,
  resume,
  deleteTask
} from '@/api/springsongs/job/SpringJob/SpringJob'
export default {
  data() {
    return {
      tableData: [],
      fileList: [],
      multipleSelection: [],
      searchForm: {

      },
      size: 20,
      page: 0,
      total: 0,
      springJobGroups: [],
      dialogAddVisible: false,
      dialogEditVisible: false,
      dialogImportVisible: false,
      // 新增界面数据
      addForm: {},
      uploadForm: {},
      editForm: {},
      addFormRules: {
        groupCode: [{
          required: true,
          message: '请输入组别编码',
          trigger: 'blur'
        }],
        groupTitle: [{
          required: true,
          message: '请输入组别名称',
          trigger: 'blur'
        }],
        taskTitle: [{
          required: true,
          message: '请输入任务名称',
          trigger: 'blur'
        }],
        taskClassTitle: [{
          required: true,
          message: '请输入任务类',
          trigger: 'blur'
        }],
        cronExpression: [{
          required: true,
          message: '请输入时间表达式',
          trigger: 'blur'
        }],
        remark: [{
          required: true,
          message: '请输入备注',
          trigger: 'blur'
        }]
      },
      editFormRules: {

        groupCode: [{
          required: true,
          message: '请输入组别编码',
          trigger: 'blur'
        }],
        groupTitle: [{
          required: true,
          message: '请输入组别名称',
          trigger: 'blur'
        }],
        taskTitle: [{
          required: true,
          message: '请输入任务名称',
          trigger: 'blur'
        }],
        taskClassTitle: [{
          required: true,
          message: '请输入任务类',
          trigger: 'blur'
        }],
        cronExpression: [{
          required: true,
          message: '请输入时间表达式',
          trigger: 'blur'
        }],

        remark: [{
          required: true,
          message: '请输入备注',
          trigger: 'blur'
        }]
      }

    }
  },
  created() {
    this.handleSearch()
  },
  methods: {
    sizeChangeHandle(val) {
      this.size = val
      this.page = 0
      this.handleSearch()
    },
    handleSelectionChange(val) {
      this.multipleSelection = val
    },
    handleCurrentChange(val) {
      this.page = val
      this.handleSearch()
    },
    // 重置表单
    resetForm(formName) {
      this.$refs[formName].resetFields()
    },
    // 查询
    handleSearch: function () {
      const self = this
      search(self.page, self.size, self.searchForm).then(
        function (response) {
          self.tableData = response.data
          self.total = response.count
          self.loading = false
        }
      )
    },
    // 显示新增界面
    handleAdd: function () {
      this.listSpringGroup()
      this.dialogAddVisible = true
    },
    // 保存
    handleSave: function (formName) {
      const self = this
      this.$refs[formName].validate((valid) => {
        if (valid) {
          save(this.addForm).then((res) => {
            self.$message.success(res.msg)
            self.handleSearch()
            self.dialogAddVisible = false
          })
        } else {
          this.$message.error('请填写必填项')
        }
      })
    },
    // 更新
    handleUpdate: function (formName) {
      const self = this
      edit(self.editForm).then((res) => {
        self.$message.success(res.msg)
        self.handleSearch()
        self.dialogEditVisible = false
      })
    },
    // 显示编辑界面
    handleEdit: function () {
      const self = this
      if (self.multipleSelection.length === 0) {
        self.$message.warning('请选择修改项目')
      } else if (self.multipleSelection.length > 1) {
        self.$message.warning('只允许选择一项修改项目')
      } else {
        self.editForm = self.multipleSelection[0]
        this.listSpringGroup()
        console.log(self.editForm)
        this.dialogEditVisible = true
      }
    },
    // 显示编辑界面
    handleSingleEdit: function (index, row) {
      const self = this
      this.listSpringGroup()
      self.editForm = row
      this.dialogEditVisible = true
    },

    // 显示导入界面
    handleImport: function () {
      this.dialogImportVisible = true
    },

    // 删除
    handleDel: function () {
      const self = this
      const ids = []
      if (self.multipleSelection.length === 0) {
        self.$message.warning('请选择删除项目')
        return
      }
      this.$confirm('确认删除该记录吗?', '提示', {
        type: 'warning'
      }).then(() => {
        self.multipleSelection.map((item) => {
          ids.push(item.id)
        })
        batchDelete(ids).then(res => {
          self.$message.success(res.msg)
          self.handleSearch()
        })
      }).catch(() => { })
    },
    handleSingleDelete(index, row) {
      const self = this
      self.$confirm('确认删除该记录吗?', '提示', {
        type: 'warning'
      }).then(() => {
        const para = {
          taskClassName: row.taskClassTitle,
          groupCode: row.groupCode
        }
        deleteTask(para).then(function (response) {
          self.$message.success(response.msg)
          self.handleSearch()
        })
      }).catch(() => { })
    },
    handlePauseEdit(index, row) {
      const self = this
      self.$confirm('确认暂停任务吗?', '提示', {
        type: 'warning'
      }).then(() => {
        const para = {
          taskClassName: row.taskClassTitle,
          groupCode: row.groupCode
        }
        pause(para).then(function (response) {
          self.$message.success(response.msg)
          self.handleSearch()
        })
      }).catch(() => { })
    },
    handleResumeEdit(index, row) {
      const self = this
      self.$confirm('确认恢复任务吗?', '提示', {
        type: 'warning'
      }).then(() => {
        const para = {
          taskClassName: row.taskClassTitle,
          groupCode: row.groupCode
        }
        resume(para).then(function (response) {
          self.$message.success(response.msg)
          self.handleSearch()
        })
      }).catch(() => { })
    },
    listSpringGroup() {
      const self = this
      listAllSpringJobGroupCategory()
        .then(function (response) {
          self.springJobGroups = response.data
          // console.log(self.springJobGroups);
          // self.$message.success(response.data.msg);
          // self.handleSearch();
        })
    },
    springJobGroupListAddChange: function (selectVal) {
      let obj = {}
      console.log(selectVal)
      obj = this.springJobGroups.find((item) => {
        return item.code === selectVal
      })
      if (obj === '' || obj === undefined) {
        this.$message.error('请选择任务组!')
        return
      }
      this.addForm.groupTitle = obj.title
      this.addForm.groupCode = obj.code
    },
    springJobGroupListEditChange: function (selectVal) {
      let obj = {}
      obj = this.springJobGroups.find((item) => {
        return item.code === selectVal
      })
      if (obj === '' || obj === undefined) {
        this.$message.error('请选择任务组!')
        return
      }
      this.editForm.groupTitle = obj.title
      this.editForm.groupCode = obj.code
    },
    // 上传
    // 关装对话框
    handleClose(done) {
      this.$confirm('确认关闭？')
        .then(_ => {
          done()
        })
        .catch(_ => { })
    }
  }
}
