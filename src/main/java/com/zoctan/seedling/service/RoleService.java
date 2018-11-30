package com.zoctan.seedling.service;

import com.zoctan.seedling.core.service.Service;
import com.zoctan.seedling.dto.RoleDTO;
import com.zoctan.seedling.entity.RoleDO;

/**
 * @author Zoctan
 * @date 2018/05/27
 */
public interface RoleService extends Service<RoleDO> {
  void save(RoleDTO roleDTO);

  void update(RoleDTO roleDTO);
}
