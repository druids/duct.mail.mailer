(ns duct.mail.stdout
  (:require
    [integrant.core :as ig]))


(defrecord Boundary [spec logger])

(defmethod ig/init-key :duct.mail/stdout [_ conf]
  (->Boundary (dissoc conf :logger) (:logger conf)))
