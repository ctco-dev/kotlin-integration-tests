package com.home.domain

import com.home.dto.Data
import com.home.integration.DataClient
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class DataCRUDTest {

    private val client = DataClient()

    @Test
    fun create() {
        val content = "abcdef"
        val id = client.create(content)
        assertAll(
                { assertNotNull(id) },
                { assertEquals(content, client.get(id)?.content) }
        )
    }

}