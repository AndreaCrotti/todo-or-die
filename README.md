# Todo or die

```clojure
(require '[todo-or-die.core :as todo])
(require '[cljc.java-time.local-date :as ld])

(todo/todo-or-die
 (todo/after? (ld/of 2022 01 01))
 (defn deprecated-function []
   (println "I Should exist anymore in 2022")))
```
