import request from '@/utils/request'

// 查询测试单列表
export function listDemo(query) {
  return request({
    url: '/demo/demo/list',
    method: 'get',
    params: query
  })
}

// 查询测试单详细
export function getDemo(id) {
  return request({
    url: '/demo/demo/' + id,
    method: 'get'
  })
}

// 新增测试单
export function addDemo(data) {
  return request({
    url: '/demo/demo',
    method: 'post',
    data: data
  })
}

// 修改测试单
export function updateDemo(data) {
  return request({
    url: '/demo/demo',
    method: 'put',
    data: data
  })
}

// 删除测试单
export function delDemo(id) {
  return request({
    url: '/demo/demo/' + id,
    method: 'delete'
  })
}
