//ex
var mysql      = require('mysql'); //mysql 모듈 사용

var connection = mysql.createConnection({ 
  host     : 'localhost',
  user     : 'root',
  password : '1111',
  database : 'exampleDB'
});
 
connection.connect(); //연결 시작
 //SQL문을 통해 데이터를 가져옴
connection.query('SELECT * from topic', function (error, results, fields) {
  if (error) {
      console.log(error);
  };
  console.log(results[0].title); //쿼리 결과에서 첫번째에 있는 title정보를 가져옴
});
 
connection.end(); //연결 종료