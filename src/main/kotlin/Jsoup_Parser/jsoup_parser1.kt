package org.example.Jsoup_Parser

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    try {
        val doc: Document = Jsoup.connect(URL).get()
        val quoteElements = doc.select("article")

        println("Цитаты из произведения \"Автостопом по галактике\" Дугласа Адамса [[1]]:")
        quoteElements.forEach { element ->
            println("- ${element.text()}")
        }
    } catch (e: Exception) {
        println("Произошла ошибка при подключении к странице: ${e.message}")
    }

}

const val URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"