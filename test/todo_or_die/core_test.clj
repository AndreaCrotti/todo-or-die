(ns todo-or-die.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljc.java-time.local-date :as ld]
            [todo-or-die.core :as sut]))

(deftest todo-or-die-test
  (testing "future"
    (sut/todo-or-die
     (sut/after? (ld/of 2022 01 01))
     (def x 1)
     (is (= x 1))))

  (testing "in past"
    (is (thrown?
         Exception
         (sut/todo-or-die
          (sut/after? (ld/of 2021 01 01))
          (defn hello []
            1))))))
