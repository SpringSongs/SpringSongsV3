import request from '@/utils/request'
import qs from 'qs'
export function search(data,page,size) {
  return request({
    url: '/SYS-API/SpringDictionaryDetail/ListByPage?page=' + page + '&size=' + size,
    method: 'post',
    data
  })
}

export function get(id) {
  return request({
    url: '/SYS-API/SpringDictionaryDetail/Detail?id=' + id,
    method: 'get'
  })
}

export function save(data) {
  return request({
    url: '/SYS-API/SpringDictionaryDetail/Create',
    method: 'post',
    data
  })
}

export function edit(data) {
  return request({
    url: '/SYS-API/SpringDictionaryDetail/Edit/',
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
    url: '/SYS-API/SpringDictionaryDetail/SetDeleted',
    method: 'post',
    data
  })
}
