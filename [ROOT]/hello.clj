(ns my-app.core
  (:gen-class)
  (:require [cljfx.api :as fx]))

(defn -main [& args]
  (fx/launch!
    (fx/create-component
      {:fx/type :stage
       :showing true
       :title "Hello, cljfx!"
       :scene {:fx/type :scene
               :root {:fx/type :label
                      :text "Hello, World!"}}})))
