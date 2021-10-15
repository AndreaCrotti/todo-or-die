# Todo or die

Inspired by other projects like [Rust todo or die](https://docs.rs/todo-or-die/0.1.2/todo_or_die/).

```clojure
(require '[todo-or-die.core :as todo])
(require '[cljc.java-time.local-date :as ld])

(todo/todo-or-die
 (todo/after? (ld/of 2022 01 01))
 (defn deprecated-function []
   (println "I Should exist anymore in 2022")))
```
