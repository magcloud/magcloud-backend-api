package hackathon.redbeanbackend.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class TagResponseDTO(
    val id: Long,
    val name: String
)
