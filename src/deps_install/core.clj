(ns deps-install.core
  (:require
   [clojure.core.async :as a :refer [chan go go-loop <! >! <!! >!!  take! put! offer! poll! alt! alts! close! onto-chan!
                                     pub sub unsub mult tap untap mix admix unmix pipe
                                     timeout to-chan  sliding-buffer dropping-buffer
                                     pipeline pipeline-async]]
   [clojure.string]
   [clojure.spec.alpha :as s]
   [clojure.java.io :as io]))

(do (set! *warn-on-reflection* true) (set! *unchecked-math* true))

(defn process
  [opts]
  (let [default-opts {}
        {:keys []} (merge default-opts opts)]))


(comment

  (require
   '[deps-install.core]
   :reload)

  (-main)

  ;
  )