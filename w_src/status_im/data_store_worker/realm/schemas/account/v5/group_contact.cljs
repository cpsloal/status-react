(ns status-im.data-store-worker.realm.schemas.account.v5.group-contact
  (:require [taoensso.timbre :as log]))

(def schema {:name       :group-contact
             :properties {:identity   "string"}})

(defn migration [_ _]
  (log/debug "migrating group-contact schema v5"))
