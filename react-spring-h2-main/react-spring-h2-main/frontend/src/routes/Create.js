import React from "react";

function Create() {
  return (
    <div className="create__container">
      <form action="/api/members/create" method="post">
        <div className="form-group">
          <label htmlFor="name">이름</label>
          <input
            type="text"
            id="name"
            name="name"
            placeholder="이름을 입력하세요"
          />
        </div>
        <button type="submit">등록</button>
      </form>
    </div>
  );
}

export default Create;
