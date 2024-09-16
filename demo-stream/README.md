### Stream
!!! 7-80% time using stream and map
- .stream()係新OBJ
  - 做完.map or .flatMap 轉左type可以 .stream()返佢繼續用佢D method做野
-同collection一D開係都冇, 但可以輕鬆轉換黎用
-都係一大list of野

-After Java 8, Stream有D好勁既野而List冇, 所以要轉條List過黎用D FUNCTION

-只有 .map()可以改變個value同type

-Arrays.asList()  //Java 8
    -可以Modify -> set
-List.of() //Java 9
    -唔可以Modify -> no .add .remove .set
    -但因為少function, 所以性能更好
    -唔可以有null

# FlatMap

# Optional
-只會用黎做return type only
-唔會出現係parameter

- 搵野搵唔到得3個情況:
    -return null (Not good, 等於冇做野)咁做唔係玩人就係玩自己.
    -return Optional (多數唔係一d error 既情況. 好似搵個user id, 係data base 搵個人, 咁真係冇黎個人就搵唔到, 係好正常既事, 唔係error既事. 但我地俾個靚仔既解決方法出黎)
    -Throw (多數係真係一d error既狀況throw左佢)Throw係最好選擇

