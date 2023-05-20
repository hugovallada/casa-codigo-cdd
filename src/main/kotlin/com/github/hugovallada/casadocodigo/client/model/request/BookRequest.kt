package com.github.hugovallada.casadocodigo.client.model.request

import com.fasterxml.jackson.annotation.JsonFormat
import com.github.hugovallada.casadocodigo.domain.schema.BookDTO
import com.github.hugovallada.casadocodigo.shared.rules.PriceRules.MIN_PRICE
import com.github.hugovallada.casadocodigo.shared.rules.SizeRule.BOOK_RESUME_SIZE
import com.github.hugovallada.casadocodigo.shared.rules.SizeRule.MIN_BOOK_PAGES
import jakarta.validation.constraints.*
import java.math.BigDecimal
import java.time.LocalDate

data class BookRequest(
    @field:NotBlank
    override val title: String,
    @field:NotBlank
    @field:Size(max = BOOK_RESUME_SIZE)
    override val resume: String,
    override val description: String,
    @field:NotNull
    @Min(MIN_PRICE)
    override val price: BigDecimal,
    @field:NotNull
    @Min(MIN_BOOK_PAGES)
    override val numberOfPages: Int,
    override val isbn: String,
    @field:Future
    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    override val releaseDate: LocalDate,
    @field:NotBlank
    override val categoryName: String,
    @field:NotBlank
    override val authorEmail: String
) : BookDTO
