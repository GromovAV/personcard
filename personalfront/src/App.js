import React, { Component } from 'react';
import './App.css';
import PersonApp from './component/PersonApp';

class App extends Component {
  render() {
    return (
      <div className="container">
        <PersonApp />
      </div>
    );
  }
}

export default App;
