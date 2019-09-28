package io.scalajs.nodejs
package tls

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * The tls module provides an implementation of the Transport Layer Security (TLS) and Secure Socket Layer (SSL)
  * protocols that is built on top of OpenSSL.
  * @see https://nodejs.org/dist/v7.6.0/docs/api/tls.html
  */
@js.native
trait Tls extends js.Object {

  /**
    * Same as tls.connect() except that port and host can be provided as arguments instead of options.
    * @param port     Default value for options.port.
    * @param host     Optional default value for options.host.
    * @param options  See tls.connect().
    * @param callback See tls.connect().
    * @example connect(port[, host][, options][, callback])
    */
  def connect(port: Int, host: String, options: TlsConnectOptions, callback: js.Function): Unit = js.native

  def createSecureContext(options: SecureContextOptions = js.native): SecureContext = js.native

}

/**
  * TLS Singleton
  */
@js.native
@JSImport("tls", JSImport.Namespace)
object Tls extends Tls

class TlsConnectOptions() extends js.Object
