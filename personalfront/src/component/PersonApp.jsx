import React, { Component } from 'react';
import ListLanguagesComponent from './ListLanguagesComponent';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import PersonComponent from './PersonComponent';

class PersonApp extends Component {
    render() {
        return (
            <Router>
                <>
                    <h1>Gromov Anton</h1>
                    <Switch>
                        <Route path="/" exact component={ListLanguagesComponent} />
                        <Route path="/languages" exact component={ListLanguagesComponent} />
                        <Route path="/persons/:id" component={PersonComponent} />
                    </Switch>
                </>
            </Router>
        )
    }
}

export default PersonApp