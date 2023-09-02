(ns my-app.core
  (:import [javax.swing JFrame JLabel]))

(defn -main []
  (let [frame (JFrame. "Hello Swing!")
        label (JLabel. "Hello, World!")]
    (.setDefaultCloseOperation frame JFrame/EXIT_ON_CLOSE)
    (.add frame label)
    (.pack frame)
    (.setVisible frame true)))
