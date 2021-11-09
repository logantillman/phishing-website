import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <div class="container">
        <label class="element" for="uname"><b>Username</b></label>
        <input class="element" type="text" placeholder="Enter Username" name="uname" required/>

        <label class="element" for="psw"><b>Password</b></label>
        <input class="element" type="password" placeholder="Enter Password" name="psw" required/>

        <button type="submit">Login</button>
      </div>
    </div>
  );
}

export default App;
