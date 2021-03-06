import request from '@/utils/request'
import qs from 'qs'
export function search(page, size, data) {
  // var data = qs.stringify(data)
  return request({
    url: '/ACTIVITI-API/SpringActVacation/ListByPage?page=' + page + '&size=' + size,
    method: 'post',
    data
  })
}

export function save(data) {
  return request({
    url: '/ACTIVITI-API/SpringActVacation/Create',
    method: 'post',
    data
  })
}

export function edit(data) {
  return request({
    url: '/ACTIVITI-API/SpringActVacation/Edit',
    method: 'put',
    data
  })
}

export function batchDelete(data) {
  data = qs.stringify({
    'ids': data
  }, {
    indices: false
  })
  return request({
    url: '/ACTIVITI-API/SpringActVacation/SetDeleted',
    method: 'post',
    data
  })
}

export function submitSpringActVacation(data) {
  return request({
    url: '/ACTIVITI-API/SpringActVacation/SubmitSpringActVacation',
    method: 'post',
    data
  })
}
export function get(id) {
  return request({
    url: '/ACTIVITI-API/SpringActVacation/Detail?id=' + id,
    method: 'get'
  })
}

export function listSpringDictionaryDetailByDictionaryCode(dictionaryCode) {
  return request({
    url: '/SYS-API/SpringDictionaryDetail/ListSpringDictionaryDetailByDictionaryCode?dictionaryCode=' + dictionaryCode,
    method: 'get'
  })
}

export function passOrReject(data, taskId) {
  return request({
    url: '/ACTIVITI-API/SpringActVacationApprove/CompleteSpringActVacationApprove?taskId=' + taskId,
    method: 'post',
    data
  })
}

export function findByVacationId(vacationId) {
  return request({
    url: '/ACTIVITI-API/SpringActVacationApprove/FindByVacationId?vacationId=' + vacationId,
    method: 'get'
  })
}
