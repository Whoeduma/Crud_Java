<h1 align="center"> 💄 Projeto CRUD de Maquiagem - Java</h1>

## Objetivo
Este é um projeto simples de **CRUD (Criar, Ler, Atualizar, Deletar)** feito em **Java puro**, sem uso de frameworks, com persistência em **arquivo `.txt`**. O sistema permite gerenciar uma lista de maquiagens, incluindo marca, tipo e cor.

## 📋 Funcionalidades
- ✅ Cadastrar nova maquiagem  
- 📄 Listar todas as maquiagens cadastradas  
- ✏️ Editar dados de uma maquiagem existente  
- ❌ Remover uma maquiagem por ID  
- 💾 Salvamento dos dados em arquivo `maquiagem.txt`

## 🧱 Estrutura do Projeto

- `Maquiagem.java` → Classe modelo com os atributos `id`, `marca`, `tipo`, `cor`
- `MaquiagemCrud.java` → Contém os métodos de CRUD e manipulação de arquivo
- `Main.java` → Interface via terminal para interação com o usuário

## 💡 Tecnologias utilizadas

- Java 21+  
- I/O de arquivos (`BufferedWriter`, `BufferedReader`)
- Lógica de console (modo texto)

## ▶️ Como executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/Whoeduma/Crud_Java.git
2. Abra no seu IDE (Eclipse, IntelliJ ou VS Code com extensão Java)
3. Execute a classe `Main.java`

## 📝 Exemplo de uso
Ao executar o programa, será exibido um menu com as opções:
1. Cadastrar maquiagem
2. Listar maquiagens
3. Editar maquiagem
4. Remover maquiagem
0. Sair

## 🗂️ Armazenamento
Todas as maquiagens são salvas no arquivo maquiagem.txt, localizado na raiz do projeto.

## 📌 Observações
- O ID das maquiagens é gerado automaticamente.
- O sistema é feito com fins educacionais para estudo de Java básico e manipulação de arquivos.

## 👩‍💻 Autora
Desenvolvido por 
<a href="https://www.linkedin.com/in/eduarda-martins-moreira/" title="Eduarda Martins"> Eduarda Martins </a>
