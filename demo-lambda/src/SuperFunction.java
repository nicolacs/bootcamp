@FunctionalInterface
// !!! this page create for /DemoLambdaFunction's example only
public interface SuperFunction<T, U, V, R> {
    R apply(T t, U u, V v);
    
}
