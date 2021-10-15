(ns todo-or-die.core
  (:require [cljc.java-time.local-date :as ld]))

(defmacro todo-or-die [check-fn & forms]
  `(do
     (assert (~check-fn) "Condition failed")
     ~@forms))

(defn after? [i]
  (constantly (ld/is-after i (ld/now))))
