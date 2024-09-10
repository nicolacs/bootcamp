## Nested Class
- 必須有個 OUTER OBJ 先可以NEW 一個 INNER'S CLASS' OBJ
- 靠個OBJ 去生產Inner 既obj, 唔係靠個outer class
- inner obj 可以向上搵 outer既value, 但outer 生產完inner 唔可以用返inner 既value

- local inner class係廢既, 唔會用

# Anonymous Inner Class 會用
- 同一interface page入面, 同一個method 可以有唔同override.
  - eg, 幾個person, 每人一個run() 都可以override佢唔同既run法
  - 可以new一個interface