package co.bearus.magcloud.controller.dto.response

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class APIResponse(val success: Boolean, val message: String, val data: Any? = null) {
    companion object {
        fun ok(message: String) = co.bearus.magcloud.controller.dto.response.APIResponse(true, message)
        fun ok(message: String, data: Any?) =
            co.bearus.magcloud.controller.dto.response.APIResponse(true, message, data)

        fun error(message: String) = co.bearus.magcloud.controller.dto.response.APIResponse(false, message)
        fun error(message: String, data: Any?) =
            co.bearus.magcloud.controller.dto.response.APIResponse(false, message, data)
    }
}
