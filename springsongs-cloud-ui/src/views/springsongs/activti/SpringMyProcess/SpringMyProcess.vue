<template>
  <div class="app-container">
    <el-row>
      <el-col :span="24">
        <div class="bg-white h-100 mx-1 p-1 shadowed">
          <el-tabs type="border-card">
            <el-tab-pane label="我的申请">
              <el-form ref="searchForm" :model="searchForm">
                <el-row>
                  <el-col :span="6">
                    <div class="demo-input-suffix">
                      <el-input v-model="searchForm.category" placeholder="请输入内容">
                        <template slot="prepend">任务分类：</template>
                      </el-input>
                    </div>
                  </el-col>
                  <el-col :span="6">
                    <div class="demo-input-suffix">
                      <el-input v-model="searchForm.title" placeholder="请输入内容">
                        <template slot="prepend">任务名称：</template>
                      </el-input>
                    </div>
                  </el-col>
                </el-row>
              </el-form>
            </el-tab-pane>
          </el-tabs>
          <el-tabs type="border-card">
            <el-tab-pane label="我的申请">
              <div class="block">
                <el-button-group>
                  <el-button type="success" icon="el-icon-search" @click="handleSearch()">查询</el-button>
                </el-button-group>
              </div>
              <template>
                <el-table
                  ref="multipleTable"
                  :data="tableData"
                  tooltip-effect="dark"
                  highlight-current-row
                  style="width: 100%;"
                  border
                  @selection-change="handleSelectionChange"
                >
                  <el-table-column label="任务名称" width="250">
                    <template slot-scope="scope">
                      {{ scope.row.startTitle }}
                    </template>
                  </el-table-column>
                  <el-table-column label="所属流程">
                    <template slot-scope="scope">
                      {{ scope.row.pdName }}
                    </template>
                  </el-table-column>
                  <el-table-column label="流程发起人" width="180">
                    <template slot-scope="scope">
                      {{ scope.row.startUserName }}
                    </template>
                  </el-table-column>
                  <el-table-column label="发起时间" width="300">
                    <template slot-scope="scope">
                      {{ scope.row.submitTime }}
                    </template>
                  </el-table-column>
                  <el-table-column label="审核结果" width="300">
                    <template slot-scope="scope">
                      <el-tag v-if="scope.row.auditStr === '2'" size="success">通过</el-tag>
                      <el-tag v-else-if="scope.row.auditStr === '3'" size="small" type="danger">不通过</el-tag>
                      <el-tag v-else size="small" type="info">处理中</el-tag>
                    </template>
                  </el-table-column>
                  <el-table-column label="流程状态">
                    <template slot-scope="scope">
                      {{ scope.row.status }}
                    </template>
                  </el-table-column>
                </el-table>
                <el-row>
                  <el-col :span="24" class="toolbar" style="padding-bottom: 0px;">
                    <div class="pagination">
                      <el-pagination
                        layout="total, sizes, prev, pager, next, jumper"
                        :total="total"
                        :page-size="size"
                        :current-page="page"
                        @current-change="handleCurrentChange"
                        @size-change="sizeChangeHandle"
                      />
                    </div>
                  </el-col>
                </el-row>
              </template>
            </el-tab-pane>
          </el-tabs>
        </div>
      </el-col>
    </el-row>
  </div></template>

<script src='./SpringMyProcess.js'>
</script>

<style>
  .block {
    padding: 10px 0px;
  }
</style>
