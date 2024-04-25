from flask import Flask, jsonify

app = Flask(__name__)

# Exemplo de dados (pode ser substituído por seus próprios dados)
livros = [
    {"id": 1, "titulo": "Dom Quixote", "autor": "Miguel de Cervantes"},
    {"id": 2, "titulo": "Guerra e Paz", "autor": "Liev Tolstói"},
    {"id": 3, "titulo": "Cem Anos de Solidão", "autor": "Gabriel García Márquez"}
]

# Endpoint para obter todos os livros
@app.route('/livros', methods=['GET'])
def obter_livros():
    return jsonify(livros)

# Endpoint para obter um livro por ID
@app.route('/livros/<int:livro_id>', methods=['GET'])
def obter_livro(livro_id):
    livro = [livro for livro in livros if livro['id'] == livro_id]
    if len(livro) == 0:
        return jsonify({'erro': 'Livro não encontrado'}), 404
    return jsonify(livro[0])

if __name__ == '__main__':
    app.run(debug=True)
