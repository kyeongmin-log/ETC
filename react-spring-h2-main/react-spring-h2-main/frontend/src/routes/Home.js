import React from "react";
import { Link } from "react-router-dom";

function Home() {
  return (
    <div>
      <p>Hello, World!</p>
      <ul>
        <li>
          <Link to="/create">create</Link>
        </li>
        <li>
          <Link to="/read">read</Link>
        </li>
        <li>
          <Link to="/login">login</Link>
        </li>
      </ul>
    </div>
  );
}

export default Home;
