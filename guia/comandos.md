Comandos
========

Configurações básicas e globais
```
$ git config --global user.name "[seu nome]"
$ git config --global user.email [seu e-mail]
$ git config --global apply.whitespace nowarn
$ git config --global core.whitespace nowarn
$ git config --global color.branch auto
$ git config --global color.diff auto
$ git config --global color.status auto
```

Forma interativa de adicionar arquivos
```
git add -i
```

Interface gráfica para visualizar logs
```
gitk
```

Voltando ao commit anterior descartando totalmente o commit atual
```
$ git reset --hard HEAD^
```

Volta ao último commit e mantém os últimos arquivos no Stage
```
git reset HEAD~1 --soft
```

Volta para o commit com a hash XXXXXXXXXXX
```
git reset --hard XXXXXXXXXXX
```

Voltando ao commit anterior, mas criando um novo commit
```
$ git revert HEAD
```

Mostra os arquivos controlados pelo git e seus hashcodes
```
git ls-files --stage
git ls-files --stage --abbrev
```

Pega o hash da árvore principal através do HEAD
```
git cat-file -p HEAD
```

Visualiza a estrutura da git tree
```
git ls-tree <hash git tree>
```