import React from "react";
import { BrowserRouter, Route } from "react-router-dom";
import Home from "./routes/Home";
import Create from "./routes/Create";
import Read from "./routes/Read";
import Login from "./routes/Login";
import Board from "./routes/Board";
import "./App.css";

function App() {
  return (
    <BrowserRouter>
      <Route path="/" exact={true} component={Home} />
      <Route path="/create" component={Create} />
      <Route path="/read" component={Read} />
      <Route path="/login" component={Login} />
      <Route path="/board" component={Board} />
    </BrowserRouter>
  );
}

export default App;
