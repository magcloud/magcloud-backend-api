package co.bearus.magcloud.domain.exception

open class DomainException(message: String) : RuntimeException(message) {
    constructor() : this("알 수 없는 오류가 발생했습니다")
}
