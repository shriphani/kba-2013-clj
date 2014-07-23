(ns kba-2013-clj.dump-uri
  "Module to dump URIs which
   will serve as starting points
   for the Clueweb12++ crawl"
  (:require [kba-2013-clj.core :as core]
            [clojure.string :as string]
            [clojure.java.io :as io]))

(defn handle-file
  [a-file]
  (map :url (core/read-file a-file)))

(defn -main
  [files-list]
  (let [files (string/split-lines
               (slurp files-list))

        out-file (str files-list "-abs-uris.txt")

        out-file-handle (io/writer out-file :append true)]
    (doseq [a-file files]
      (doseq [uri (handle-file a-file)]
        (binding [*out* out-file-handle]
          (println uri))))))
