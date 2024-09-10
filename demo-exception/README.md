### Exception  ~100***
-邊度產生business meaning, 就係邊度處理exception.
-通常處理unhappy path(error handling), excepton 要set time-out, 可能出圖片/訊息話call唔到下一步, eg:payment過唔到版
  -error404只係general 地handle左

## # What is unchecked excption?
- You don't have to handle the exception by "try catch" or "rethrow
- You can ignore the potential exception scenario (refer to /ExceptionChainExamplecopy.java)
- 
# Unchecked Excepion(Runtime Exception)
- By zero, NPE, IAE, IndexOutOfBound, etc. (Memory Limitation)

## What is checked excption?
- Create Custom class (extends Exception.class)
- You have to handle the exception by 2 ways:
  - "Try Catch"
  - "rethrow by methd signature"
- Example refer to /BusinessException.java

# Checked Exception (Complie-time Exception)
- IOException (DB login, Server service unavailable, File Access, File Not Found, etc)
- Custom Exception

### Why we need Exception?
- The world without Exception, you can only use "return" for method communication
return -> Happy Path
- The world with Exception, you can both use "return" and "throw"


- try{ 
  }  catch(ArrayIndexOutOfBoundsException e)
  }  catch(StringIndexOutOfBound e)  - Example:
    - char[]
    - substring...

revision : collection.sort