var mysql = require('mysql');
//db.js를 만들어서 이 부분에 자신의 데이터 베이스 정보를 입력
var db = mysql.createConnection({
    host     : '',
    user     : '',
    password : '',
    database : ''
  });
  db.connect();
  module.exports = db;