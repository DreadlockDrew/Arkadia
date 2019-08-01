from flask import Flask, send_from_directory
import view #TODO minimize imports of view

app=Flask(__name__)


@app.route('/')
def index():
    return send_from_directory(view, 'index.html')


app.run(port=8080)