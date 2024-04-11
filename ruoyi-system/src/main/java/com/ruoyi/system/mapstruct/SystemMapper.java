package com.ruoyi.system.mapstruct;

import com.ruoyi.common.core.domain.dto.RoleDTO;
import com.ruoyi.common.core.domain.dto.UserOnlineDTO;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.event.OperLogEvent;
import com.ruoyi.system.domain.SysOperLog;
import com.ruoyi.system.domain.SysOss;
import com.ruoyi.system.domain.SysOssConfig;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.bo.SysOssConfigBo;
import com.ruoyi.system.domain.vo.SysOssVo;
import com.ruoyi.system.domain.vo.SysUserExportVo;
import com.ruoyi.system.domain.vo.SysUserImportVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SystemMapper {

    List<SysUserOnline> toSysUserOnline(List<UserOnlineDTO> ls);

    List<SysUserExportVo> toSysUserExportVo(List<SysUser> ls);

    List<RoleDTO> toRoleDTO(List<SysRole> ls);

    SysUser toSysUser(SysUserImportVo e);

    SysOperLog toSysOperLog(OperLogEvent e);

    SysOssConfig toSysOssConfig(SysOssConfigBo e);

    SysOssVo toSysOssVo(SysOss e);

}
