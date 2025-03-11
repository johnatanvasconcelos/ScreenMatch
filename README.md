# 🎬 ScreeMatch Streaming Service (Java POO) (🚧...EM ANDAMENTO)

Este é um projeto básico de um **serviço de streaming**, que está sendo desenvolvido em **Java** para praticar os conceitos de **Programação Orientada a Objetos (POO)**. O objetivo é simular um serviço de streaming onde os usuários podem acessar e gerenciar filmes, séries e seus episódios.

---

## 🚀 Funcionalidades

✅... Cadastro de filmes e séries com título, gênero, duração, etc.  
🚧... Gerenciamento de usuários e playlists personalizadas  
🚧... Simulação de reprodução de mídia  
✅ Sistema de avaliação dos conteúdos  
✅ Uso de princípios da **POO**: **Encapsulamento, Herança, Polimorfismo e Abstração**  

---

## 🛠️ Tecnologias utilizadas

- **Java 17+**
- **Paradigma POO** (Classes, Objetos, Herança, etc.)
- **Coleções Java** (ArrayList, HashMap, etc.)
---
```
## 📂 Estrutura do projeto
📦 streaming-service 
    ┣ 📂 src 
    ┃   ┣📂 com.screenmatch 
    ┃   ┃   ┣ 📂 models 
    ┃   ┃   ┃   ┣ 📜 Episode.java 
    ┃   ┃   ┃   ┣ 📜 Movie.java 
    ┃   ┃   ┃   ┣ 📜 Series.java 
    ┃   ┃   ┃   ┣ 📜 Title.java
    ┃   ┃   ┣ 📂 calculations
    ┃   ┃   ┃   ┣ 📜 FilterRecomendation.java 
    ┃   ┃   ┃   ┣ 🟢 Rateable.java 
    ┃   ┃   ┃   ┣ 📜 TimeCalculator.java
    ┣ 📜 Main.java 
    ┣ 📜 README.md
---
```
Conceitos de POO aplicados
🔹 Encapsulamento: Uso de private para atributos e métodos de acesso (getters e setters).
🔹 Herança: Movie e Series herdam da classe Title.
🔹 Polimorfismo: Métodos sobrescritos para diferentes tipos de Title.
🔹 Abstração: Classe Title como base para Movie e Series.

