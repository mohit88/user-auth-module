import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  state = {
    isLoading: true,
    users: []
  };

  async componentDidMount() {
    const response = await fetch('/users');
    const body = await response.json();
    this.setState({ users: body, isLoading: false });
  }

  render() {
    const {users, isLoading} = this.state;

    if (isLoading) {
      return <span className="spinner"></span>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="App-intro">
            <h2>Users List</h2>
            {users.map(user => 
              <div className="users" key={user.id}>
                <span> {user.name} </span>
                <span> {user.email} </span>
              </div>
            )}
          </div>
        </header>
      </div>
    );
  }
}

export default App;