(ns brave.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn add! [some-string]
  (println (str some-string "!")))

(defn add-more! [name first-thing & more-things]
  (println (str "Hi!, " name))
  (println (str "Your first thing is: " first-thing))
  (println (str "The rest of your things are: "
                (clojure.string/join ", " more-things))))

(map (fn [x] (+ x 1)) '(3 4 5))

(def more-one
  (fn [x] (+ x 1)))

(def more-one'
  #(+ % 1))

(map #(+ % 1) '(1 2 3))

(defn inc-closure
  [num]
  #(+ % num))

(def add3 (inc-closure 3))

(add3 4)
