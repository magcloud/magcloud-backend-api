package co.bearus.magcloud.domain.repository

import co.bearus.magcloud.domain.entity.user.UserTokenEntity
import org.springframework.data.jpa.repository.JpaRepository

interface JPAUserTokenRepository : JpaRepository<UserTokenEntity, Long>
