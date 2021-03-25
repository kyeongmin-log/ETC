# FrontEnd 초기 설정

1. nodejs 설치 (터미널에서 node -v로 설치 확인)

2. vsc 터미널에서 **create-react-app [폴더명]** 실행 (React 설치)

## Proxy 문제 해결 (middleware)

> client: localhost:3000 - (proxy) - server: localhost:8080

1. 터미널에서 npm install http-proxy-middleware --save 실행

2. src 폴더 안에 setupProxy.js 생성

3. 코드 작성

```js
//setupProxy.js
const { createProxyMiddleware } = require("http-proxy-middleware");

module.exports = function (app) {
  app.use(
    "/api",
    createProxyMiddleware({
      target: "http://localhost:8080",
      changeOrigin: true,
    })
  );
};
```
