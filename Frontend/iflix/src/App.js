import React, { Component } from 'react';
import './App.css';
import {BrowserRouter as Router,Route} from "react-router-dom"

import LoginPage from "./pages/Login" 

export class App extends Component  {
  render(){
  return (
    <div className="App">
      <Router>

        <div>
          <Route path="/Login" component={LoginPage}></Route>
        </div>
      </Router>
      
    </div>
  );
}

}
export default App;
