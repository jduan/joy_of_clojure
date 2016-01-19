(ns chapter2.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn make-test
  ([& args] (set args)))
(+ 1 2)

(make-test 3)
(make-test 3 4)
(make-test 3 4 5)
(make-test 3 4 5 6)

(do
  (def x 5)
  (def y 4)
  (+ x y)
  [x y])

(let [r 5
      pi 3.1415
      r-square (* r r)]
  (println "radius is" r)
  (* pi r-square))

(defn print-down-from [x]
  (when (pos? x)
    (println x)
    (recur (dec x))))

(print-down-from 10)

(defn my-sum [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))
(my-sum 0 10)

