package pl.deesoft.fakerpreview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.fakerConfig

class GreetingPreviewProvider : PreviewParameterProvider<String> {

    private val fakerConfig = fakerConfig {
        withLocale("en")
        withRandomSeed(0)
    }
    private val faker = Faker(fakerConfig)

    override val values: Sequence<String> = sequenceOf(
        faker.address.streetAddress(),
        faker.address.streetAddress()
    )
}
