window.onload = function() {
  function add(func) {
    let result = func(10, 20);
    console.log(result);
  }
  add(a1);
  add(a2);
  add(a3);
  add(a4);
  function a1(x, y) { return (x + y); }
  function a2(x, y) { return (x - y); }
  function a3(x, y) { return (x * y); }
  function a4(x, y) { return (x / y); }
}

$(function() {
  
})