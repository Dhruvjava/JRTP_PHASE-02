package com.cb.users.mapper;

import com.cb.users.entity.Permissions;
import com.cb.users.rq.PermissionsRq;
import com.cb.users.rs.PermissionsRs;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

@Slf4j
public class PermissionsMapper {

    public static PermissionsRs mapToPermissionsRs(Permissions permissions, ModelMapper mapper) {
        if (log.isDebugEnabled()) {
            log.debug("Executing mapToPermissionsRs(Permissions) -> ");
        }
        try {
            return mapper.map(permissions, PermissionsRs.class);
        } catch (Exception e) {
            log.error("Exception in mapToPermissionsRs(Permissions) -> {0}", e);
            throw e;
        }
    }

    public static Permissions mapToPermissions(PermissionsRq permissionsRq, ModelMapper mapper) {
        if (log.isDebugEnabled()) {
            log.debug("mapToPermissions(PermissionsBean) ->");
        }
        try {
            Permissions permissions = mapper.map(permissionsRq, Permissions.class);
            LocalDateTime date = LocalDateTime.now();
            permissions.setCreatedBy("Admin");
            permissions.setCreatedOn(date);
            permissions.setUpdatedBy("Admin");
            permissions.setUpdatedOn(date);
            return permissions;
        } catch (Exception e) {
            log.error("Exception in mapToPermissions(PermissionsBean permissionsBean) -> {0}", e);
            throw e;
        }
    }

//    public static Permissions mapToPermissions(PermissionsRq permissionsRq, ModelMapper mapper) {
//        if (log.isDebugEnabled()) {
//            log.debug("mapToPermissions(PermissionsBean) ->");
//        }
//        try {
//            Permissions permissions = mapper.map(permissionsRq, Permissions.class);
//            LocalDateTime date = LocalDateTime.now();
//            permissions.setUpdatedBy("Admin");
//            permissions.setUpdatedOn(date);
//            return permissions;
//        } catch (Exception e) {
//            log.error("Exception in mapToPermissions(PermissionsBean permissionsBean) -> {0}", e);
//            throw e;
//        }
//    }

    public static Permissions mapToPermissions(PermissionsRs permissionsRq, ModelMapper mapper) {
        if (log.isDebugEnabled()) {
            log.debug("mapToPermissions(PermissionsBean) ->");
        }
        try {
            Permissions permissions = mapper.map(permissionsRq, Permissions.class);
            LocalDateTime date = LocalDateTime.now();
            permissions.setCreatedBy("Admin");
            permissions.setCreatedOn(date);
            permissions.setUpdatedBy("Admin");
            permissions.setUpdatedOn(date);
            return permissions;
        } catch (Exception e) {
            log.error("Exception in mapToPermissions(PermissionsBean permissionsBean) -> {0}", e);
            throw e;
        }
    }

    public static PermissionsRq mapToPermissionsRq(PermissionsRs permissionsRq, ModelMapper mapper) {
        if (log.isDebugEnabled()) {
            log.debug("mapToPermissions(PermissionsBean) ->");
        }
        try {
            return  mapper.map(permissionsRq, PermissionsRq.class);
        } catch (Exception e) {
            log.error("Exception in mapToPermissions(PermissionsBean permissionsBean) -> {0}", e);
            throw e;
        }
    }

}
