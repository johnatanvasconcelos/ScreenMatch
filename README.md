# 🎬 ScreenMatch Streaming Service (Java POO) 
## (🚧...EM ANDAMENTO)

O ***ScreenMatch*** é um projeto desenvolvido em Java que simula um catálogo de filmes e séries, permitindo a pesquisa, o cadastro e a avaliação de títulos. Ele foi criado como um exercício prático para aplicar os conceitos de **Programação Orientada a Objetos (POO)** e demonstrar a interação com uma **API externa**, o **OMDB** (*Open Movie Database*). O projeto também implementa a **persistência de dados** em um arquivo JSON e o tratamento de erros, além de armazenar a chave da API de forma segura.

---

## 🚀 Funcionalidades
*   **✅ Pesquisa de Títulos:**
    *   O sistema permite pesquisar filmes e séries pelo título, utilizando a API do OMDB.
    *   A pesquisa retorna informações como título, ano de lançamento e duração.
*   **✅ Cadastro de Títulos:**
    *   Os títulos pesquisados são cadastrados no sistema, armazenando informações como título, ano de lançamento e duração.
    *   As informações são obtidas através da API do OMDB e convertidas para objetos Java.
*   **✅ Avaliação de Títulos:**
    *   Em construção...
*   **✅ Exibição de Informações:**
    *   O sistema exibe informações detalhadas sobre os títulos, incluindo título, ano, duração e etc.
    *   Para séries: em construção...
*   **✅ Persistência de Dados:**
    *   Os títulos cadastrados são armazenados em um arquivo JSON (`titles.json`), permitindo que os dados sejam mantidos entre as execuções do programa.
*   **✅ Tratamento de Erros:**
    *   O projeto implementa tratamento de erros para:
        *   Falhas na requisição à API do OMDB.
        *   Erros na conversão de JSON para objetos Java.
        *   Falhas na escrita do arquivo JSON.
        *   Erros na conversão do ano.
    *   Excersonalizadas (`ApiRequestException`, `JsonConversionException`, `FileWriteException`) são utilizadas para um tratamento de erros mais específico.
*   **✅ Armazenamento Seguro da API Key:**
    *   A chave da API do OMDB é armazenada de forma segura em um arquivo separado (`api.key`), que é excluído do controle de versão do Git através do arquivo `.gitignore`.
*   **✅ Leitura da API Key:**
    * A chave da API é lida de forma segura através da classe `ApiKeyReader`.


✅ Cadastro de filmes e séries com título, gênero, duração, etc.  
🚧... Gerenciamento de usuários e playlists personalizadas  
🚧... Simulação de reprodução de mídia  
✅ Sistema de avaliação dos conteúdos  
✅ Uso de princípios da **POO**: **Encapsulamento, Herança, Polimorfismo e Abstração**  

---

## 🛠️ Tecnologias utilizadas

*   **Java 17+:** Linguagem de programação principal.
*   **Programação Orientada a Objetos (POO):** Paradigma de programação utilizado.
*   **Java HTTP Client:** Para realizar requisições à API do OMDB.
*   **Gson:** Biblioteca para conversão de JSON para objetos Java e vice-versa.
*   **Coleções Java:** `ArrayList` para armazenar os títulos.
*   **Exceções Personalizadas:** Para um tratamento de erros mais específico.
* **File Handling:** Para ler a API key e escrever os dados.

---

## 📂 Estrutura do projeto

``` 
📦 streaming-service 
    ┣ 📂 src 
    ┃   ┣📂 com.screenmatch 
    ┃   ┃   ┣ 📂 api 
    ┃   ┃   ┃   ┣ 📜 OmdbApiClient.java 
    ┃   ┃   ┣ 📂 exception 
    ┃   ┃   ┃   ┣ 📜 ApiRequestException.java 
    ┃   ┃   ┃   ┣ 📜 FileWriteException.java 
    ┃   ┃   ┃   ┣ 📜 JsonConversionException.java
    ┃   ┃   ┣ 📂 main
    ┃   ┃   ┃   ┣ 📜 Main.java
    ┃   ┃   ┣ 📂 models 
    ┃   ┃   ┃   ┣ 📜 Episode.java 
    ┃   ┃   ┃   ┣ 📜 Movie.java
    ┃   ┃   ┃   ┣ 📜 OmdbTitle.java
    ┃   ┃   ┃   ┣ 📜 Series.java 
    ┃   ┃   ┃   ┣ 📜 Title.java
    ┃   ┃   ┣ 📂 service 
    ┃   ┃   ┃   ┣ 📜 TitleConverter.java
    ┃   ┃   ┃   ┣ 📜 TitleSearchService.java
    ┃   ┃   ┣ 📂 utils
    ┃   ┃   ┃   ┣ 📜 ApiKeyReader.java 
    ┃   ┃   ┃   ┣ 📜 JsonFileWriter.java  
    ┣ 📜 com.screenmatch.main.Main.java 
    ┣ 📜 README.md
```
---

## Conceitos de POO aplicados
🔹 Encapsulamento: Uso de private para atributos e métodos de acesso (getters e setters).
🔹 Herança: Movie e Series herdam da classe Title.
🔹 Polimorfismo: Métodos sobrescritos para diferentes tipos de Title.
🔹 Abstração: Classe Title como base para Movie e Series.

