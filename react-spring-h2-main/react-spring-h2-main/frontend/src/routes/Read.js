import { React, useState, useEffect } from "react";
import axios from "axios";

function Read() {
  const [Members, setMembers] = useState([]);

  const getMember = async () => {
    const { data } = await axios.get("api/members");

    setMembers(data);
  };

  useEffect(() => {
    getMember();
  }, []);

  return (
    <div>
      <p>Member List</p>
      <ul>
        {Members.map((member) => (
          <li key={member.id}>{member.name}</li>
        ))}
      </ul>
    </div>
  );
}

export default Read;
