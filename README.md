Adicione as dependências do pacote ao arquivo build.gradle (Gradle Groovy) ou ao arquivo build.gradle.kts (Kotlin DSL).

Exemplo do uso do Gradle Groovy:

dependencies {
    implementation 'com.example:sdk:1.0.0'
}

Exemplo de uso do Kotlin DSL:

dependencies {
    implementation("com.example:sdk:1.0.0")
}

Adicione o repositório ao arquivo build.gradle (Gradle Groovy) ou ao arquivo build.gradle.kts (Kotlin DSL).

Exemplo do uso do Gradle Groovy:

repositories {
    maven {
    		name = 'GitHubPackages'
    		url = uri('https://maven.pkg.github.com/camilacarvalhoaraujo/teste')
    		credentials {
      			username = 'camilacarvalhoaraujo'
      			password = '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'
    		}
	}
}
Exemplo de uso do Kotlin DSL:

repositories {
    maven {
        name = 'GitHubPackages'
  		  url = uri('https://maven.pkg.github.com/camilacarvalhoaraujo/teste')
        credentials {
            username = 'camilacarvalhoaraujo'
  			    password = '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'
        }
    }
}
