from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from . import controller
from . import models

def create_app():
    '''factory for flask app object'''

    # create app object
    app = Flask(__name__)

    app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///../test.db'
    app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
    models.db.init_app(app)

    # register blueprints on app
    app.register_blueprint(controller.blueprints.ping.bp, url_prefix='/ping')
    app.register_blueprint(controller.blueprints.api.bp, url_prefix='/api')

    # return app
    return app

def reset_db():
    '''drop and recreate all tables'''
    app=create_app()
    models.db.drop_all(app=app)
    models.db.create_all(app=app)