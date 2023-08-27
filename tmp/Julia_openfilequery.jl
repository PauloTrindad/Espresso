# Abre um arquivo chamado "meu_arquivo.txt" no modo de gravacao, o sistema gera o script quando o arquivo for aberto em /tmp/Julia_openfilequery.jl e deleta depois que for fechado.
arquivo = open("meu_arquivo.txt", "w")

# Lê todo o conteúdo do arquivo e armazena em uma variável chamada "conteudo"
conteudo = read(arquivo, String)

# Fecha o arquivo
close(arquivo)

# Exibe o conteúdo do arquivo na tela
println(conteudo)
